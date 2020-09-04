package First;

    public class Shape {
        public int numberOfShapes;
        private String nameOfShapes;
        public int lenghtOfShapes;

        public Shape(){
        }

        public Shape(int numberOfShapes, String nameOfShapes, int lenght){
            this.numberOfShapes = numberOfShapes;
            this.nameOfShapes = nameOfShapes;
            this.lenghtOfShapes=lenght;
        }
        public Shape(int numberOfShapes, String nameOfShapes){
            numberOfShapes=numberOfShapes;
            nameOfShapes=nameOfShapes;
        }
        @Override
        public String toString(){
            return "Shape{" +
                    "numberOfShapes="+ numberOfShapes+
                    ", nameOfShapes" + nameOfShapes- ;}
    }

}
