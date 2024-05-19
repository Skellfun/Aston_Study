package lesson_2.task_3;

public class Computer {
    static class Processor {
        private String model;

        public Processor(String model) {
            this.model = model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getDetails(){
            return model;
        }
    }
    public class RAM{
        private long size;

        public RAM(long size) {
            this.size = size;
        }

        public void setSize(long size) {
            this.size = size;
        }

        public long getDetails(){
            return size;
        }
    }
}
