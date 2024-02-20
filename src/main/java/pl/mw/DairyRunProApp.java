package pl.mw;

import pl.mw.data.TrainingWriter;
import pl.mw.input.UserInputManager;
import pl.mw.model.Training;

import java.util.ArrayList;
import java.util.List;

public class DairyRunProApp {

    public static void main(String[] args) {

        UserInputManager userInputManager = new UserInputManager();
        List<Training> trainingList = new ArrayList<>();

        while (true) {
            Training training = userInputManager.nextTraining();
            if (training == null) {
                break;
            }
            trainingList.add(training);
        }

        System.out.println("Training details:");
        for (Training training : trainingList) {
            System.out.println(training);
        }

        String fileName = "training_data.txt";
        TrainingWriter.writeToTxtFile(trainingList, fileName);
    }
}
