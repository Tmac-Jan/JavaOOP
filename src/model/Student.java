package model;

/**
 * @author 76497
 * @title: Student
 * @projectName JavaOOP
 * @description: TODO
 * @date 2019/6/2815:14
 */
public class Student {
    private String stuNum;
    private Integer stuAge;
    private Integer gender;

    public Student(){}
    public Student(String stuNum,Integer stuAge,Integer gender){
        this.stuNum=stuNum;
        this.stuAge=stuAge;
        this.gender=gender;
    }
    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum='" + stuNum + '\'' +
                ", stuAge=" + stuAge +
                ", gender=" + (gender==1?"男":"女") +
                '}';
    }
}
