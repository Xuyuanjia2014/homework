public class Person {
    private String name;
    private String gender;
    private Integer age;
    private String description;
    private Double score;

    public void whoAmI(){
        System.out.println(this.name);
    }

    public Integer killYou(){
        Integer res = this.age;
        if(this.age > 20){
            System.out.println(" kill you.");
            res = 20;
        }
        else{
            System.out.println(" kill me.");
            res = 18;
        }
        return this.age+res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(20);
        p.setName("Wuheng");
        p.killYou();
        p.whoAmI();
    }
}
