    package o_Encapsulation;

             public class Person {
                  //name-we will assign the name(set)
                  // name print-we are getting the name (get)
                   private String name;
                        private int id;

                        public String getName() {   // getter method
                            return name;
                        }

                        public void setName(String name) {// setter method
                            this.name = name;
                        }

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public static void main(String[] args) {
                            Person person= new Person();
                            person.setId(25);
                            person.setName("Holly");

                            System.out.println(person.getName());
                            System.out.println(person.getId());

                        }
                    }
