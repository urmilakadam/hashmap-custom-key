package pojo;

import java.util.Objects;

public class StudentMutableClass extends Student{

    private String studentMutableName;

    public StudentMutableClass(String name) {
        super(name);
        this.studentMutableName =name;
    }

    public void setStudentMutableName(String studentMutableName) {
        this.studentMutableName = studentMutableName;
    }

    @Override
    public String getName() {
        return studentMutableName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentMutableClass)) return false;
        if (!super.equals(o)) return false;
        StudentMutableClass that = (StudentMutableClass) o;
        return studentMutableName.equals(that.studentMutableName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentMutableName);
    }
}
