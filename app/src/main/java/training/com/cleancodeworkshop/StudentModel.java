package training.com.cleancodeworkshop;

import org.parceler.Parcel;

/**
 * Created by Semicolon07 on 2/15/2017 AD.
 */

@Parcel
public class StudentModel {
    String name;
    String birthDate;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
