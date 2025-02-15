package ru.ivt5;

import ru.ivt5.school.*;

import java.util.Set;

public class Main {
    public static void main(String[] args) throws TrainingException {

    }
}
//        TraineeMap traineeMap = new TraineeMap();
//
//        // Define some trainees
//        Trainee trainee1 = new Trainee("Alice", "abc", 5);
//        Trainee trainee2 = new Trainee("Bob", "adf", 5);
//        Trainee trainee3 = new Trainee("Charlie", "abc", 5);
//
//        try {
//            // Test addTraineeInfo
//            System.out.println("Adding trainee1...");
//            traineeMap.addTraineeInfo(trainee1, "Institute A");
//            System.out.println("Adding trainee2...");
//            traineeMap.addTraineeInfo(trainee2, "Institute B");
//            System.out.println("Size after adding: " + traineeMap.getTraineesCount());
//
//            try {
//                System.out.println("Adding trainee1 again (should throw exception)...");
//                traineeMap.addTraineeInfo(trainee1, "Institute A"); // Should throw exception
//            } catch (TrainingException e) {
//                System.out.println("Caught exception (expected): " + e.getMessage());
//            }
//
//            // Test getInstituteByTrainee
//            System.out.println("Getting institute for trainee1...");
//            String institute1 = traineeMap.getInstituteByTrainee(trainee1);
//            System.out.println("Institute: " + institute1);
//
//            try {
//                System.out.println("Getting institute for non-existent trainee (should throw exception)...");
//                traineeMap.getInstituteByTrainee(trainee3); // Should throw exception
//            } catch (TrainingException e) {
//                System.out.println("Caught exception (expected): " + e.getMessage());
//            }
//
//            // Test replaceTraineeInfo
//            System.out.println("Replacing trainee1's institute...");
//            traineeMap.replaceTraineeInfo(trainee1, "Institute X");
//            System.out.println("Updated institute for trainee1: " + traineeMap.getInstituteByTrainee(trainee1));
//
//            try {
//                System.out.println("Trying to replace non-existent trainee (should throw exception)...");
//                traineeMap.replaceTraineeInfo(trainee3, "Institute Y"); // Should throw exception
//            } catch (TrainingException e) {
//                System.out.println("Caught exception (expected): " + e.getMessage());
//            }
//
//            // Test removeTraineeInfo
//            System.out.println("Removing trainee2...");
//            traineeMap.removeTraineeInfo(trainee2);
//            System.out.println("Size after removal: " + traineeMap.getTraineesCount());
//
//            try {
//                System.out.println("Trying to remove trainee2 again (should throw exception)...");
//                traineeMap.removeTraineeInfo(trainee2); // Should throw exception
//            } catch (TrainingException e) {
//                System.out.println("Caught exception (expected): " + e.getMessage());
//            }
//
//            // Test getAllTrainees
//            System.out.println("All trainees: " + traineeMap.getAllTrainees());
//
//            // Test getAllInstitutes
//            System.out.println("All institutes: " + traineeMap.getAllInstitutes());
//
//            // Test isAnyFromInstitute
//            System.out.println("Is any trainee from 'Institute X'? " + traineeMap.isAnyFromInstitute("Institute X"));
//            System.out.println("Is any trainee from 'Institute Z'? " + traineeMap.isAnyFromInstitute("Institute Z"));
//
//        } catch (TrainingException e) {
//            System.out.println("Unexpected exception: " + e.getMessage());
//        }
//
//        System.out.println("All tests completed.");
//    }
//}




//        try {
//            // Создадим школу с правильными атрибутами
//            School school = new School("High School", 2023);
//            System.out.println("Создана школа: " + school.getName() + ", год основания: " + school.getYear());
//
//            // Попробуем установить новое имя школы
//            try {
//                school.setName("New High School");
//                System.out.println("Имя школы изменено на: " + school.getName());
//            } catch (TrainingException e) {
//                System.out.println("Ошибка при изменении имени школы: " + e.getMessage());
//            }
//
//            // Проверка установки нового года
//            school.setYear(2024);
//            System.out.println("Год основания изменился на: " + school.getYear());
//
//            // Работа с группами
//            Group group1 = new Group("Math Group", "ABC");
//            Group group2 = new Group("Science Group", "ABC");
//
//            // Добавление группы (успешное)
//            try {
//                school.addGroup(group1);
//                System.out.println("Группа добавлена: " + group1.getName());
//            } catch (TrainingException e) {
//                System.out.println("Ошибка при добавлении группы: " + e.getMessage());
//            }
//
//            // Попытка добавить дубликат группы (ошибка)
//            try {
//                school.addGroup(group1);
//            } catch (TrainingException e) {
//                System.out.println("Ошибка при добавлении дубликата группы: " + e.getMessage());
//            }
//
//            // Добавление второй группы
//            try {
//                school.addGroup(group2);
//                System.out.println("Группа добавлена: " + group2.getName());
//            } catch (TrainingException e) {
//                System.out.println("Ошибка при добавлении группы: " + e.getMessage());
//            }
//
//            // Проверка, содержится ли группа в школе
//            boolean containsMathGroup = school.containsGroup(group1);
//            System.out.println("Школа содержит Math Group: " + containsMathGroup);
//
//            // Удаление группы (по объекту)
//            try {
//                school.removeGroup(group1);
//                System.out.println("Группа удалена: " + group1.getName());
//            } catch (TrainingException e) {
//                System.out.println("Ошибка при удалении группы: " + e.getMessage());
//            }
//
//            // Удаление группы по имени
//            try {
//                school.removeGroup("Science Group");
//                System.out.println("Группа удалена по имени: Science Group");
//            } catch (TrainingException e) {
//                System.out.println("Ошибка при удалении группы по имени: " + e.getMessage());
//            }
//
//            // Попытка удалить несуществующую группу
//            try {
//                school.removeGroup(new Group("Non-existent Group", "ABC"));
//            } catch (TrainingException e) {
//                System.out.println("Ошибка при удалении несуществующей группы: " + e.getMessage());
//            }
//
//            // Попытка удалить группу по имени, которая не существует
//            try {
//                school.removeGroup("Non-existent Group");
//            } catch (TrainingException e) {
//                System.out.println("Ошибка при удалении группы по имени (несуществующей): " + e.getMessage());
//            }
//
//            // Проверка получения всех групп
//            Set<Group> groups = school.getGroups();
//            if (!groups.isEmpty()) {
//                System.out.println("Группы в школе:");
//                for (Group g : groups) {
//                    System.out.println("\t" + g.getName());
//                }
//            } else {
//                System.out.println("В школе сейчас нет групп.");
//            }
//
//            // Проверка equals и hashCode
//            School anotherSchool = new School("Another School", 2023);
//            boolean isEqual = school.equals(anotherSchool);
//            System.out.println("Сравнение школ: " + (isEqual ? "школы равны" : "школы не равны"));
//
//        } catch (TrainingException e) {
//            System.out.println("Ошибка при создании школы: " + e.getMessage());
//        }
//    }
//}




//        try {
//            // Пример 1: Пробуем указать некорректное имя
//            System.out.println("Создаем Trainee с пустым именем...");
//            Trainee trainee1 = new Trainee("", "Ivanov", 5);
//        } catch (TrainingException e) {
//            System.err.println("Ошибка при создании Trainee: " + e.getMessage());
//            System.err.println("Код ошибки: " + e.getErrorCode());
//        }
//
//        try {
//            // Пример 2: Пробуем указать некорректную фамилию
//            System.out.println("Создаем Trainee с пустой фамилией...");
//            Trainee trainee2 = new Trainee("Petr", "", 5);
//        } catch (TrainingException e) {
//            System.err.println("Ошибка при создании Trainee: " + e.getMessage());
//            System.err.println("Код ошибки: " + e.getErrorCode());
//        }
//
//        try {
//            // Пример 3: Пробуем установить рейтинг вне диапазона
//            System.out.println("Создаем Trainee с неправильным рейтингом...");
//            Trainee trainee3 = new Trainee("Anna", "Petrova", -5);
//        } catch (TrainingException e) {
//            System.err.println("Ошибка при создании Trainee: " + e.getMessage());
//            System.err.println("Код ошибки: " + e.getErrorCode());
//        }
//
//        try {
//            // Пример 4: Успешное создание Trainee
//            System.out.println("Создаем Trainee с корректными данными...");
//            Trainee trainee4 = new Trainee("Ivan", "Smirnov", 5);
//            System.out.println("Trainee успешно создан: " + trainee4.getFullName() + " с рейтингом " + trainee4.getRating());
//        } catch (TrainingException e) {
//            System.err.println("Ошибка при создании Trainee: " + e.getMessage());
//        }
//    }
