public class Person {
    public String Name;
    public String Birthdate;
    public String Department;
    public String Major;
    public String Age;
    public String Height;
    public String Weight;
    public double Distance;
    public double Time;
    
    public static void main(String[] args) {
        Person person1 = new Person();
        int Speed = 80;
        person1.setInformation("Name: Muhammad Audya F", "\nBirthdate: 06 Juli 2001", "\nDepartment: Pariwisata dan Informatika", "\nMajor: Teknologi Informasi", "\nAge: 20", "\nHeight: 174 cm", "\nWeight: 51 kg");
        System.out.println(person1.getInformation());
        System.out.println("Speed: " + Speed + " km/minute");
        person1.Distance = 8.7;
        person1.Time = person1.Distance / Speed;
        person1.setDistanceTime(person1.Distance, person1.Time);
        System.out.println(person1.getDistanceTime());
    }

    public void setInformation(String a, String b, String c, String d, String e, String f, String g) {
        this.Name = a;
        this.Birthdate = b;
        this.Department = c;
        this.Major = d;
        this.Age = e;
        this.Height = f;
        this.Weight = g;
    }

    public String getInformation() {
        return this.Name + this.Birthdate + this.Department + this.Major + this.Age + this.Height + this.Weight;
    }

    public void setDistanceTime(double x, double y) {
        this.Distance = x;
        this.Time = y;
    }

    public String getDistanceTime() {
        return "Distance: " + String.valueOf(this.Distance) +"\nTime: " + String.valueOf(this.Time);
    }
}