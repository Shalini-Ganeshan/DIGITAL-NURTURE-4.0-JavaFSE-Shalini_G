public class Country {
    private String code;
    private String name;
    private String location;

    public Country() {
        LoggerFactory.getLogger(Country.class).debug("Inside Country Constructor.");
    }

    public String getCode() {
        LoggerFactory.getLogger(Country.class).debug("Getting code");
        return code;
    }

    public void setCode(String code) {
        LoggerFactory.getLogger(Country.class).debug("Setting code");
        this.code = code;
    }

    public String getName() {
        LoggerFactory.getLogger(Country.class).debug("Getting name");
        return name;
    }

    public void setName(String name) {
        LoggerFactory.getLogger(Country.class).debug("Setting name");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" + "code='" + code + '\'' + ", name='" + name + '\'' + '}';
    }
}
