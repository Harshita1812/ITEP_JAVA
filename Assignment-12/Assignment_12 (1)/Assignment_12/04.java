interface CertificateProvider{
    void generateCertificate();
}

abstract class Course{
    String title;
    int duration;

    public Course(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    public abstract void startCourse();
    public abstract void endCourse();

    public void courseDetails(){
        System.out.println("Title of the course is: " + this.title + " and it's duration is " + this.duration + " months");
    }
}

class VideoCourse extends Course implements CertificateProvider{
    public VideoCourse(String title, int duration){
        super(title, duration);
    }
    public void startCourse(){
        System.out.println("Starting Video Course: " + this.title);
    }
    public void endCourse(){
        System.out.println("Ending Video Course: " + this.title);
    }
    public void generateCertificate(){
        System.out.println("Certificate generated for Video Course: " + this.title);
    }
}

class LiveCourse extends Course{

    public LiveCourse(String title, int duration){
        super(title, duration);
    }
    public void startCourse(){
        System.out.println("Starting Live Course: " + this.title);
    }
    public void endCourse(){
        System.out.println("Ending Live Course: " + this.title);
    }
}

class LearningPlatform{
    public static void main(String args[]){
        Course first = new LiveCourse("Java Programming", 6);
        Course second = new VideoCourse("C++ Programming", 6);
        
        first.startCourse();
        second.startCourse();
       
        first.courseDetails();
        second.courseDetails();
       
        first.endCourse();
        second.endCourse();

       
        if(first instanceof CertificateProvider){
            ((CertificateProvider)first).generateCertificate();
        }
        if(second instanceof CertificateProvider) {
            ((CertificateProvider)second).generateCertificate();
        }
    }
}