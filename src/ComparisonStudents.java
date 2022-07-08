public class ComparisonStudents {

    public static void comparisonStudentsGryffindor(GryffindorStudent[] gryffindorStudents) {
        int harrysPoints = gryffindorStudents[0].getConjure() + gryffindorStudents[0].getTransgress() + gryffindorStudents[0].getNobility() +
                gryffindorStudents[0].getHonor() + gryffindorStudents[0].getBravery();
        int hermionePoints = gryffindorStudents[1].getConjure() + gryffindorStudents[1].getTransgress() + gryffindorStudents[1].getNobility() +
                gryffindorStudents[1].getHonor() + gryffindorStudents[1].getBravery();
        int ronaPoints = gryffindorStudents[2].getConjure() + gryffindorStudents[2].getTransgress() + gryffindorStudents[2].getNobility() +
                gryffindorStudents[2].getHonor() + gryffindorStudents[2].getBravery();

        if (harrysPoints >= hermionePoints && harrysPoints >= ronaPoints) {
            System.out.println("Гарри лучший Гриффиндорец, чем Рон и Гемиона");
        } else if (hermionePoints >= harrysPoints && hermionePoints >= ronaPoints) {
            System.out.println("Гермиона лучший Гриффиндорец, чем Рон и Гарри");
        } else {
            System.out.println("Рон лучший Гриффиндорец, чем Гемиона и Гарри");
        }
    }

    public static void comparisonStudentsHufflepuff(RavenclawStudent[] ravenclawStudents) {
        int zachariahPoints = ravenclawStudents[0].getConjure() + ravenclawStudents[0].getTransgress() + ravenclawStudents[0].getSmart() + ravenclawStudents[0].getWise() +
                ravenclawStudents[0].getWitty() + ravenclawStudents[0].getCreativity();
        int cedricPoints = ravenclawStudents[1].getConjure() + ravenclawStudents[1].getTransgress() + ravenclawStudents[1].getSmart() + ravenclawStudents[1].getWise() +
                ravenclawStudents[1].getWitty() + ravenclawStudents[1].getCreativity();
        int justinPoints = ravenclawStudents[2].getConjure() + ravenclawStudents[2].getTransgress() + ravenclawStudents[2].getSmart() + ravenclawStudents[2].getWise() +
                ravenclawStudents[2].getWitty() + ravenclawStudents[2].getCreativity();
        if (zachariahPoints >= cedricPoints && zachariahPoints >= justinPoints) {
            System.out.println("Захария лучший Пуффендуйец, чем Седрик и Джастин");
        } else if (cedricPoints >= zachariahPoints && cedricPoints >= justinPoints) {
            System.out.println("Седрик лучший Пуффендуйец, чем Захария и Джастин");
        } else {
            System.out.println("Джастин лучший Пуффендуйец, чем Седрик и Джастин");
        }
    }

    public static void comparisonStudentsRavenclaw(SlytherinStudent[] slytherinStudents) {
        int zhouPoints = slytherinStudents[0].getConjure() + slytherinStudents[0].getTransgress() + slytherinStudents[0].getTrick() + slytherinStudents[0].getDetermination() +
                slytherinStudents[0].getAmbition() + slytherinStudents[0].getResourcefulness() + slytherinStudents[0].getThirstForPower();
        int padmaPoints = slytherinStudents[1].getConjure() + slytherinStudents[1].getTransgress() + slytherinStudents[1].getTrick() + slytherinStudents[1].getDetermination() +
                slytherinStudents[1].getAmbition() + slytherinStudents[1].getResourcefulness() + slytherinStudents[1].getThirstForPower();
        int marcusPoints = slytherinStudents[2].getConjure() + slytherinStudents[2].getTransgress() + slytherinStudents[2].getTrick() + slytherinStudents[2].getDetermination() +
                slytherinStudents[2].getAmbition() + slytherinStudents[2].getResourcefulness() + slytherinStudents[2].getThirstForPower();

        if (zhouPoints >= padmaPoints && zhouPoints >= marcusPoints) {
            System.out.println("Чжоу лучший Когтевранец, чем Падма и Маркус");
        } else if (padmaPoints >= zhouPoints && padmaPoints >= marcusPoints) {
            System.out.println("Падма лучший Когтевранец, чем Чжоу и Маркус");
        } else {
            System.out.println("Маркус лучший Когтевранец, чем Чжоу и Падма");
        }
    }

    public static void comparisonStudentsSlytherin(HufflepuffStudent[] hufflepuffStudents) {
        int dracoPoints = hufflepuffStudents[0].getConjure() + hufflepuffStudents[0].getTransgress() + hufflepuffStudents[0].getHonesty() +
                hufflepuffStudents[0].getLoyalty() + hufflepuffStudents[0].getIndustriousness();
        int grahamPoints = hufflepuffStudents[1].getConjure() + hufflepuffStudents[1].getTransgress() + hufflepuffStudents[1].getHonesty() +
                hufflepuffStudents[1].getLoyalty() + hufflepuffStudents[1].getIndustriousness();
        int gregoriPoints = hufflepuffStudents[2].getConjure() + hufflepuffStudents[2].getTransgress() + hufflepuffStudents[2].getHonesty() +
                hufflepuffStudents[2].getLoyalty() + hufflepuffStudents[2].getIndustriousness();

        if (dracoPoints >= grahamPoints && dracoPoints >= gregoriPoints) {
            System.out.println("Драго лучший Слизеринец, чем Грэхэм и Грегори");
        } else if (grahamPoints >= dracoPoints && grahamPoints >= gregoriPoints) {
            System.out.println("Грэхэм лучший Слизеринец, чем Драго и Грегори");
        } else {
            System.out.println("Грегори лучший Слизеринец, чем Драго и Грэхэм");
        }
    }

    public static void comparisonStudents(Student student1, Student student2) {
        if (student1.getConjure() > student2.getConjure()) {
            System.out.println(student1.getFirstName() + " " + student1.getLastName() + " обладает большей мощностью магии " + student2.getFirstName() + " " + student2.getLastName());
        }else {
            System.out.println(student2.getFirstName() + " " + student2.getLastName() + " обладает большей мощностью магии " + student1.getFirstName() + " " + student1.getLastName());
        }
        if (student1.getTransgress() > student1.getTransgress()) {
            System.out.println(student1.getFirstName() + " " + student1.getLastName() +  "обладает большей мощностью трансгресии " + student2.getFirstName() + " " + student2.getFirstName());
        } else{
            System.out.println(student2.getFirstName() + " " + student2.getLastName() +  "обладает большей мощностью трансгресии " + student1.getFirstName() + " " + student1.getFirstName());
        }

    }

}


