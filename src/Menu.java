import java.io.File;

public class Menu {

    public DataFormat getDataFromConsole(){

        do {
            System.out.println("To exit input 0.\n" +
                    "Input data format: LastName FirstName MiddleName DateOfBirth PhoneNumber Gender");
            String data = ConsoleScanner.read();
            if (data.equals("0")) {
                break;
            }
            try {
                return DataHandler.dataHandler(data);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);
        return DataFormat.nullDataFormat();
    }

}
