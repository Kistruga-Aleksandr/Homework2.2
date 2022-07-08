public class PrintService {

    public static void outputDataGryffindor(GryffindorStudent[] gryffindorStudents){
        for (GryffindorStudent gryffindorStudent : gryffindorStudents) {

            System.out.println("Имя: " + gryffindorStudent.getFirstName() + ", Фамилия: " + gryffindorStudent.getLastName() + ", колдовсво: " + gryffindorStudent.getConjure() +
                    ", трансгрессировать: " + gryffindorStudent.getTransgress() + ", благородство: " + gryffindorStudent.getNobility() + ", честь: " + gryffindorStudent.getHonor() +
                    ", храбрость: " + gryffindorStudent.getBravery());
        }
    }public static void outputDataSlytherin(HufflepuffStudent[] hufflepuffStudents){
        for (HufflepuffStudent hufflepuffStudent : hufflepuffStudents) {
            System.out.println("Имя: " + hufflepuffStudent.getFirstName() + ", Фамилия: " + hufflepuffStudent.getLastName() + ", колдовсво: " + hufflepuffStudent.getConjure() +
                    ", трансгрессировать: " + hufflepuffStudent.getTransgress() + ", трудолюбие: " + hufflepuffStudent.getIndustriousness() + ", верность: " + hufflepuffStudent.getLoyalty() +
                    ", честность: " + hufflepuffStudent.getHonesty());
        }
    }public static void outputDataHufflepuff(RavenclawStudent[] ravenclawStudents){
        for (RavenclawStudent ravenclawStudent : ravenclawStudents) {
            System.out.println("Имя: " + ravenclawStudent.getFirstName() + ", Фамилия: " + ravenclawStudent.getLastName() + ", колдовсво: " + ravenclawStudent.getConjure() +
                    ", трансгрессировать: " + ravenclawStudent.getTransgress() + ", умны: " + ravenclawStudent.getSmart() + ", мудры: " + ravenclawStudent.getWise() +
                    ", остроумны: " + ravenclawStudent.getWitty() + ", полны творчества: " + ravenclawStudent.getCreativity());
        }
    }public static void outputDataRavenclaw(SlytherinStudent[] slytherinStudents){
        for (SlytherinStudent slytherinStudent : slytherinStudents) {
            System.out.println("Имя: " + slytherinStudent.getFirstName() + ", Фамилия: " + slytherinStudent.getLastName() + ", колдовсво: " + slytherinStudent.getConjure() +
                    ", трансгрессировать: " + slytherinStudent.getTransgress() + ", хитрость: " + slytherinStudent.getTrick() + ", решительность: " + slytherinStudent.getDetermination() +
                    ", амбициозность: " + slytherinStudent.getAmbition() + ", находчивость: " + slytherinStudent.getResourcefulness() + ", жажда власти: " + slytherinStudent.getThirstForPower());
        }
    }
}
