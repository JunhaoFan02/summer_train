// 客户类
class Customer {
    private String name;
    private int age;
    private String phoneNumber;

    public Customer(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "姓名: " + name + ", 年龄: " + age + ", 电话: " + phoneNumber;
    }
}
