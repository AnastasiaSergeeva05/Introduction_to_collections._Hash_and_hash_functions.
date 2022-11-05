package passport;

import java.util.HashSet;
import java.util.Set;

public class PassportList {
    private final Set<Passport> pasports = new HashSet<>();

    public void addPassport( Passport passport){
        this.pasports.add(passport);

    }
    public Passport numberPassport(int number){
        for (Passport passport : pasports){
            if(passport.getNumber() == number){
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "PassportList{" +
                "pasports=" + pasports +
                '}';
    }
}
