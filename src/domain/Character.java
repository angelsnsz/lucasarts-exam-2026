package domain;

public class Character {
    private String id;
    private String name;
    private String type;
    private String power;
    private String debility;

    public Character(String id, String name, String type, String power, String debility) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.power = power;
        this.debility = debility;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getDebility() {
        return debility;
    }

    public void setDebility(String debility) {
        this.debility = debility;
    }
}
