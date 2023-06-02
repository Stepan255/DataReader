
import Exception.ExceptionLengthData;
import Exception.ExceptionEmptyData;

import java.text.SimpleDateFormat;

public class DataHandler {

    public static DataFormat dataHandler(String data) throws ExceptionEmptyData, ExceptionLengthData{
        DataFormat df = startDataHandler(data);
        String errLog = "";
        if (df.getFirstName().equals("")){errLog += "FirstName is empty; ";}
        if (df.getLastName().equals("")){errLog += "LastName is empty; ";}
        if (df.getMiddleName().equals("")){errLog += "MiddleName is empty; ";}
        if (df.getDateOfBirth().equals("")){errLog += "DateOfBirth is empty; ";}
        if (df.getPhoneNumber().equals("")){errLog += "PhoneNumber is empty; ";}
        if (df.getGender() == ' '){errLog += "Gender is empty; ";}
        if (!errLog.equals("")){throw new ExceptionEmptyData(errLog);}
        return df;
    }

    private static DataFormat startDataHandler(String data) throws ExceptionLengthData {
        String[] rawData = data.split(" ");
        if (rawData.length != 6) {
            throw new ExceptionLengthData(rawData.length);
        }
        DataFormat dataForm = DataFormat.nullDataFormat();
        for (String row :
                rawData) {
            if (isTel(row)) {
                dataForm.setPhoneNumber(row);
            } else if (isDate(row)) {
                dataForm.setDateOfBirth(row);
            } else if (row.equals(String.copyValueOf(new char[]{'f'})) || row.equals(String.copyValueOf(new char[]{'m'}))) {
                dataForm.setGender(row.charAt(0));
            } else if (row.matches("[A-Za-zА-Яа-я]+")) {
                if (dataForm.getFirstName() == "") {
                    dataForm.setFirstName(row);
                } else if (dataForm.getLastName() == "") {
                    dataForm.setLastName(row);
                } else if (dataForm.getMiddleName() == "") {
                    dataForm.setMiddleName(row);
                }
            }
        }
        return dataForm;
    }

    private static boolean isTel(String numberString) {
        return numberString.matches("((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}");
    }

    private static boolean isDate(String date) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yyyy");
        myFormat.setLenient(false);
        try {
            myFormat.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
