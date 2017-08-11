package oop.t8;

public class WristWatch {
     private String title;

    public WristWatch(String title) {
        this.title = title;
    }

    public void setCountry(String name) {
        class Country {
            void display() {
                System.out.println(title+", "+name);
            }
        }
        Country country = new Country();
        country.display();
    }

    public void setModel(String name) {
        class Model {
            void display() {
                System.out.println(title+", "+name);
            }
        }
        Model model = new Model();
        model.display();
    }
}

