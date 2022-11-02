package passport;

import java.time.LocalDate;

public class Passport {
    private final int number;
    private final String LastName;
    private final String name;
    private final String midleName;
    private  final LocalDate LocalData;

    public Passport(int number,
                    String lastName,
                    String name, String midleName,
                    LocalDate localData) {
        this.number = number;
        LastName = lastName;
        this.name = name;
        this.midleName = midleName;
        LocalData = localData;
    }

    public int getNumber() {
        return number;
    }

    public String getLastName() {
        return LastName;
    }

    public String getName() {
        return name;
    }

    public String getMidleName() {
        return midleName;
    }

    public LocalDate getLocalData() {
        return LocalData;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", LastName='" + LastName + '\'' +
                ", name='" + name + '\'' +
                ", midleName='" + midleName + '\'' +
                ", LocalData=" + LocalData +
                '}';
    }
}
