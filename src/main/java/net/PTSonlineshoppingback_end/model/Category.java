package net.PTSonlineshoppingback_end.model;



/**
 *
 * @author tekane
 */
public class Category {
    private int id;
    private String name;
    private String description;
    private String imageUrl;
    private boolean  active = true;

    public Category() {
    
    }
    public Category(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}