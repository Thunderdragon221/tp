package seedu.duke;

/*
import seedu.duke.diagnosis.Diagnosis;
import seedu.duke.diagnosis.IllnessMatch;
import seedu.duke.diagnosis.symptoms.Symptom;

import java.util.ArrayList;
import java.util.List;
 */
import java.util.Scanner;

import seedu.duke.ui.Menu;
import seedu.duke.ui.Parser;
import seedu.duke.save.Storage;

public class Duke {

    private static String password = ""; // Stores user's password

    /**
     * Main entry-point for the java.duke.Duke application.
     */
    //@@author Jeraldchen
    public static void main(String[] args) {
        String logo = " ____         ____        _        \n"
                + "|  _ \\  ___  |  _ \\ _  _ | | _____ \n"
                + "| | | |/ _ \\ | | | | | | | |/ / _ \\\n"
                + "| |_| | |    | |_| | |_| |   <  __/\n"
                + "|____/|_|    |____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        Storage.loadData();
        while (password.equals("")) {
            Menu.showWelcomeMenu();
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            Parser.parseWelcome(input);
        }
        //@@author Thunderdragon221
        Menu.showAccountMenu();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Parser.parseAccountCommand(input);

        /*
        For testing of Diagnosis
        for (IllnessMatch test : Diagnosis.getPossibleIllnesses(new ArrayList<Symptom>(List.of(Symptom.BLOCKED_NOSE,
                Symptom.RUNNY_NOSE,
                Symptom.SNEEZING,
                Symptom.CHILLS,
                Symptom.FATIGUE,
                Symptom.THROAT_IRRITATION)))) {
            System.out.println(test.getIllness().getIllnessName());
            System.out.println(test.getSimilarityPercentage());
        }
         */
    }

    //@@author Thunderdragon221

    /**
     * Sets the password.
     *
     * @param userPassword password to be set.
     */
    public static void setPassword(String userPassword) {
        password = userPassword;
    }

    /**
     * Returns the password.
     *
     * @return password.
     */
    public static String getPassword() {
        return password;
    }
}
