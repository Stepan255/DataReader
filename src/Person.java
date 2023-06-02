
    public class Person {
        private String LastName;
        private String FirstName;
        private String MiddleName;
        private String DateOfBirth;
        private String PhoneNumber;
        private Character Gender;

        public Person (String lastName, String firstName, String middleName, String dateOfBirth, String phoneNumber, Character gender) {
            LastName = lastName;
            FirstName = firstName;
            MiddleName = middleName;
            DateOfBirth = dateOfBirth;
            PhoneNumber = phoneNumber;
            Gender = gender;
        }

        public static Person  nullDataFormat(){
            return new Person ("", "", "", "", "", ' ');
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public String getMiddleName() {
            return MiddleName;
        }

        public void setMiddleName(String middleName) {
            MiddleName = middleName;
        }

        public String getDateOfBirth() {
            return DateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            DateOfBirth = dateOfBirth;
        }

        public String getPhoneNumber() {
            return PhoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            PhoneNumber = phoneNumber;
        }

        public Character getGender() {
            return Gender;
        }

        public void setGender(Character gender) {
            Gender = gender;
        }

        @Override
        public String toString() {
            return getLastName() + " " + getFirstName() + " " + getMiddleName() + " "
                    + getDateOfBirth() + " " + getPhoneNumber() + " " + getGender();
        }
    };


