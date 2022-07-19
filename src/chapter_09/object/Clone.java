package chapter_09.object;

public class Clone {

    static class Mother{
        private String name = "";

        Mother(){
            this("");
        }
        Mother(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class People implements Cloneable{
        private Mother mother;

        People(){
            this("" );
        }

        People(String motherName){
            this.mother = new Mother(motherName);
        }

        public Mother getMother() {
            return mother;
        }

        public void setMother(Mother mother) {
            this.mother = mother;
        }

        public People shallowCopy(){
            Object obj = null;
            try {
                obj =  super.clone();
            } catch (CloneNotSupportedException e){
                e.printStackTrace();
            }
            return (People)obj;
        }

        public People deepCopy(){
            Object obj = null;
            try {
                obj = super.clone();
            } catch (CloneNotSupportedException e){
                e.printStackTrace();
            }
            People people = (People)obj;
            String motherName = people.getMother().getName();
            people.setMother(new Mother(motherName));
            return (People)people;
        }
    }

    public static void main(String args[]){
        People ikGyeong = new People("mom");
        People ikGyeongClone = ikGyeong.shallowCopy();

        System.out.println(ikGyeong); //객체 값 : chapter_09.object.Clone$People@2133c8f8
        System.out.println(ikGyeongClone); //객체 값 : chapter_09.object.Clone$People@43a25848

        System.out.println(ikGyeong.mother); //객체 값 : chapter_09.object.Clone$Mother@3ac3fd8b
        System.out.println(ikGyeongClone.mother); //객체 값 : chapter_09.object.Clone$Mother@3ac3fd8b

        People jakson = new People("mom");
        People jaksonClone = ikGyeong.deepCopy();

        System.out.println(jakson); //객체 값 : chapter_09.object.Clone$People@2133c8f8
        System.out.println(jaksonClone); //객체 값 : chapter_09.object.Clone$People@6a5fc7f7

        System.out.println(jakson.mother); //객체 값 : chapter_09.object.Clone$Mother@3b6eb2ec
        System.out.println(jaksonClone.mother); //객체 값 : chapter_09.object.Clone$Mother@1e643faf



    }
}
