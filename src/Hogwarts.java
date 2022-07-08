public class Hogwarts {


    public static void main(String[] args) {

        GryffindorStudent[] gryffindorStudents = {
                new GryffindorStudent("Гарри ", "Поттер ",100,100,90,100,60),
                new GryffindorStudent("Гермиона ", "Грейджер ",100,100,100,90,70),
                new GryffindorStudent("Рон ","Уизли ",90,80,70,90,80)
        };
        RavenclawStudent[] ravenclawStudents = {
                new RavenclawStudent("Захария ", "Смит ",60,80,30,20,11,50),
                new RavenclawStudent("Седрик ", "Диггори ", 80,20,11,45,60,25),
                new RavenclawStudent("Джастин ", "Финч-Флетчли ", 11,60,40,30,22,55)
        };

        SlytherinStudent[] slytherinStudents = {
                new SlytherinStudent("Чжоу ", "Чанг ", 80,70,60,40,88,11,34),
                new SlytherinStudent("Падма ", "Патил ", 22,48, 76,12, 35,18, 37),
                new SlytherinStudent("Маркус ", "Белби ", 89, 38, 44,17,66,27,48)
        };

        HufflepuffStudent[] hufflepuffStudents = {
                new HufflepuffStudent("Драко ","Малфой ",100,90,50,95,6),
                new HufflepuffStudent("Грэхэм ", "Монтегю ",80,90,50,40,30),
                new HufflepuffStudent("Грегори ", "Гойл ", 50,40,20,70,10)
        };
        System.out.println("Грифиндор");
        PrintService.outputDataGryffindor(gryffindorStudents);
        System.out.println("Пуффендуй");
        PrintService.outputDataHufflepuff(ravenclawStudents);
        System.out.println("Когтевран");
        PrintService.outputDataRavenclaw(slytherinStudents);
        System.out.println("Слизерин");
        PrintService.outputDataSlytherin(hufflepuffStudents);
        System.out.println("Лучшие Студены");
        ComparisonStudents.comparisonStudentsGryffindor(gryffindorStudents);
        ComparisonStudents.comparisonStudentsHufflepuff(ravenclawStudents);
        ComparisonStudents.comparisonStudentsRavenclaw(slytherinStudents);
        ComparisonStudents.comparisonStudentsSlytherin(hufflepuffStudents);
        ComparisonStudents.comparisonStudents(slytherinStudents[0], gryffindorStudents[0]);


    }
}
