//package za.ac.cput.domain;
//
//
//    public class Delivery  {
//        private int orderIdentification;
//        public String name;
//        public String date;
//        public String address;
//
//
//        private Delivery(Builder builder) {
//            this.orderIdentification= builder.orderIdentification;
//            this.name = builder.name;
//            this.date = builder.date;
//            this.address = builder.address;
//        }
//            public String getOrderIdentification {
//            return orderIdentification;
//        }
//
//
//        public String getName() {
//            return name;
//        }
//
//        public String getDate() {
//            return date;
//        }
//
//        public String getAddress() {
//            return address;
//        }
//
////        @Override
////        public String toString() {
////            return "Delivery{" + "orderIdentification" + orderIdentification
////                    ", name='" + name + '\'' +
////                    ", date='" + date + '\'' +
////                    ", address='" + address + '\'' +
////                    '}';
////        }
//
//
//        public static class Builder {
//            private int orderIdentification;
//            private String name;
//            private String date;
//            private String address;
//
//            public Builder setOrderIdentification(int orderIdentification){
//              this.orderIdentification=orderIdentification;
//                return this
//              }
//            public Builder setName(String name) {
//                this.name = name;
//                return this;
//            }
//
//            public Builder setDate(String date) {
//                this.date = date;
//                return this;
//            }
//
//            public Builder setAddress(String address) {
//                this.address = address;
//                return this;
//            }
//
//            @Override
//            public Delivery build() {
//                return new Delivery(this);
//            }
//        }
//    }
//
