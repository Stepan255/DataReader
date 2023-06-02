public class Menu {

    public void start() {
        while (true){
            FileMenger fileMenger = new FileMenger();
            fileMenger.openFolderRepository();
            Person person = getDataFromConsole();
            fileMenger.createFile(person.getLastName(), person.toString());
        }
        }

    public Person getDataFromConsole(){

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
        return Person.nullDataFormat();
    }

}
