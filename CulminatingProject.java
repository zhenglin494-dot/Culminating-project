//NAME: Zheng Lin
import java.sql.Array;
import java.util.Scanner;
import java.util.ArrayList;
public class CulminatingProject {
    void main(){
        Scanner sc = new Scanner(System.in);
        //Store all partA and partB questions in two question banks
        String[]QuestionsA = {"Phishing is best described as:\n" +
                "A) A type of computer virus that hides inside another program\n" +
                "B) A scam where an attacker tries to trick you into revealing sensitive information by pretending to be a trusted source\n" +
                "C) A method of physically stealing computer hardware\n" +
                "D) A technique that improves the speed of your internet connection\n",
                "Which of the following is a common red flag in a phishing email?\n" +
                "A) The sender’s email address is from a well-known company you regularly do business with\n" +
                "B) The email is addressed to you by your full name\n" +
                "C) The email creates a sense of urgency and asks you to click a link to “verify” your account immediately\n" +
                "D) The message contains no spelling or grammatical errors\n",
                "What is ransomware?\n" +
                "A) Software that displays advertisements on your screen\n" +
                "B) Malware that encrypts your files and demands payment in exchange for the decryption key\n" +
                "C) A subscription fee charged by software companies\n" +
                "D) A type of firewall used by large businesses\n",
                "Which of the following is an example of social engineering?\n" +
                "A) Designing a new social media website\n" +
                "B) Writing code to break a password by brute force\n" +
                "C) Calling someone and pretending to be from IT support to get their login credentials\n" +
                "D) Sending a file over the network without encryption\n",
                "A Trojan is malware that:\n" +
                "A) Disguises itself as a legitimate or harmless program but performs malicious actions once installed\n" +
                "B) Spreads automatically across networks without any user interaction\n" +
                "C) Only attacks devices that are not connected to the internet\n" +
                "D) Is a type of antivirus software\n",
                "You receive a text message that says “Your package could not be delivered. Click here to reschedule: bit.ly/xyz123.” What should you do?\n" +
                "A) Click the link right away to make sure your package arrives on time\n" +
                "B) Reply to the message asking for more details\n" +
                "C) Do not click the link; verify the delivery directly through the courier’s official website or app\n" +
                "D) Forward the message to all your contacts to warn them\n",
                "Which of the following best describes a man-in-the-middle attack?\n" +
                "A) An attack where a hacker physically stands between two people at an ATM\n" +
                "B) An attack where an attacker secretly intercepts and possibly alters the communication between two parties\n" +
                "C) A type of denial-of-service attack\n" +
                "D) Hardware sabotage performed inside a server room\n",
                "Vishing is a form of phishing carried out:\n" +
                "A) Over voice calls\n" +
                "B) Through video games\n" +
                "C) Using printed letters in the mail\n" +
                "D) By installing software from a USB drive\n",
                "Which one of the following is most likely a sign of a spoofed website?\n" +
                "A) The URL is spelled exactly the same as the official site, including the correct top-level domain\n" +
                "B) The URL contains small misspellings or extra characters (e.g., “amaz0n-login.com” instead of “amazon.com”)\n" +
                "C) The site shows a padlock icon next to the URL\n" +
                "D) The site loads quickly with no errors\n",
                "Spyware is malware that primarily:\n" +
                "A) Encrypts your data and demands a ransom\n" +
                "B) Secretly collects information about your activity, such as keystrokes or browsing history, and sends it to a third party\n" +
                "C) Floods a website with requests until it crashes\n" +
                "D) Improves your computer’s performance by removing junk files\n"};
        String[]QuestionsB = {"Which of the following is the strongest password?\n" +
                "A) password123\n" +
                "B) Farzin2009\n" +
                "C) Tr0ub4dor&3-Spring!Tuesday\n" +
                "D) qwerty\n",
                "Two-factor authentication (2FA) protects an account by requiring:\n" +
                "A) Two different usernames\n" +
                "B) A password plus a second verification step, such as a code from an app or text message\n" +
                "C) Two separate passwords\n" +
                "D) The user to log in from two different devices at the same time\n",
                "Why should you keep your operating system and apps up to date?\n" +
                "A) Updates make your device look more modern\n" +
                "B) Updates often include security patches that fix newly discovered vulnerabilities\n" +
                "C) Updates always add new social media features\n" +
                "D) Updates are only useful for gaming computers\n",
                "You see “https://” at the start of a website’s URL. This means:\n" +
                "A) The site is guaranteed to be safe and legitimate\n" +
                "B) The data sent between your browser and the site is encrypted in transit\n" +
                "C) The site has been certified by the government\n" +
                "D) The site cannot contain malware\n",
                "Which of the following is the safest way to manage many different account passwords?\n" +
                "A) Use the same password on every account so you don’t forget it\n" +
                "B) Write all your passwords on a sticky note attached to your monitor\n" +
                "C) Use a reputable password manager to generate and store unique passwords\n" +
                "D) Use your birthday and last name on every account\n",
                "When using public Wi-Fi (e.g., at a coffee shop), the safest practice is to:\n" +
                "A) Log in to your online banking immediately to take advantage of the free network\n" +
                "B) Avoid sensitive activities, or use a reputable VPN to encrypt your traffic\n" +
                "C) Disable your firewall to improve speed\n" +
                "D) Share the network password with everyone nearby\n",
                "Why might it be risky to grant a free flashlight app access to your contacts and microphone?\n" +
                "A) The app needs those permissions to turn the flashlight on\n" +
                "B) Apps can collect and share data they don’t actually need, creating a privacy risk\n" +
                "C) Permissions make the flashlight brighter\n" +
                "D) There is no risk; permissions are only requested by safe apps\n",
                "Which of the following is a good rule for sharing personal information online?\n" +
                "A) Post your full address and phone number on your social media profile\n" +
                "B) Share only the minimum information needed and review your privacy settings regularly\n" +
                "C) Use the same profile picture and bio on every site so people can recognize you\n" +
                "D) Accept all friend or follower requests, including from strangers\n",
                "The “3-2-1” backup rule recommends keeping:\n" +
                "A) 3 copies of your data, on 2 different types of storage media, with 1 copy stored offsite\n" +
                "B) 3 passwords, 2 usernames, and 1 email account\n" +
                "C) Backups for 3 days, 2 weeks, and 1 month\n" +
                "D) 3 antivirus programs running at the same time\n",
                "If you think your account has been hacked, the first thing you should do is:\n" +
                "A) Delete the account immediately\n" +
                "B) Tell no one and hope the attacker loses interest\n" +
                "C) Change the password, enable 2FA if available, and review recent activity for unauthorized access\n" +
                "D) Post about it on social media to warn your friends\n"};
        ArrayList<String>questionsA = new ArrayList<String>();
        ArrayList<String>questionsB = new ArrayList<String>();
        for(int i = 0; i < 10; i++){
            questionsA.add(QuestionsA[i]);
            questionsB.add(QuestionsB[i]);
        }
        // Store the answer keys for both PartA and PartB
        String[]AnswersA = {"B","C","B","C","A","C","B","A","B","B"};
        String[]AnswersB = {"C","B","B","B","C","B","B","B","A","C"};
        ArrayList<String>answersA = new ArrayList<String>();
        ArrayList<String>answersB = new ArrayList<String>();
        for(int i = 0; i < 10; i++){
            answersA.add(AnswersA[i]);
            answersB.add(AnswersB[i]);
        }
        // Greeting messages & Identity selection
        while(true){
            System.out.println("Hallo, dear user, welcome to our Cybersecurity Awareness Certification activity\n" +
                    "Please choose your identity ( Pick A or B Below)\n" +
                    "A. User who takes the certification test\n" +
                    "B. Login as admin\n");
            String userIdentity = "";
            while(true){
                userIdentity = sc.nextLine();
                if(userIdentity.equals("A")){
                    break;
                }else if(userIdentity.equals("B")){
                    break;
                }else{
                    System.out.println("Invalid Input");
                }
            }
            ArrayList<Integer>selectedQuestionsA = new ArrayList<Integer>();
            ArrayList<Integer>selectedQuestionsB = new ArrayList<Integer>();
            int questionAIndex = -1;
            int questionBIndex = -1;
            double scoreA = 0;
            double scoreB = 0;
            double correctNumA = 0;
            double correctNumB = 0;
            int wrongNumA = 0;
            int wrongNumB = 0;
            double scoreEstimator = 0;
            boolean testDone = false;
            String answerA = "";
            String answerB = "";
            if(userIdentity.equals("A")){
                System.out.println("The user must earn a total score of at least 75%, and must correctly answer at least 4 questions in each section to pass\n" +
                        "Press Enter to continue");
                String skip = sc.nextLine();
                for(int i = 0; i < 6; i++){
                    if(wrongNumA > 2){
                        System.out.println("You are unable to pass the test because you have failed too many questions in part A");
                        testDone = true;
                        break;
                    }
                    while(true){
                        questionAIndex = (int)(Math.random()*(questionsA.size()));
                        if(!selectedQuestionsA.contains(questionAIndex)){
                            break;
                        }
                    }
                    System.out.println(questionsA.get(questionAIndex));
                    while(true){
                        answerA = sc.nextLine();
                        if(answerA.equals("A")){
                            break;
                        }else if(answerA.equals("B")){
                            break;
                        }else if(answerA.equals("C")){
                            break;
                        }else if(answerA.equals("D")){
                            break;
                        }else{
                            System.out.println("Invalid Input");
                        }
                    }

                    if(answerA.equals(answersA.get(questionAIndex))){
                        System.out.println("Correct\n");
                        correctNumA++;
                    }else{
                        System.out.println("False\n");
                        wrongNumA++;
                    }
                    selectedQuestionsA.add(questionAIndex);
                }
                if(!testDone){
                    scoreA = Math.round(correctNumA/6*100);
                    System.out.println("Your score for Part A is: " + scoreA + "%\n");
                }

                for(int i = 0; i < 6; i++){
                    if(wrongNumB > 2){
                        System.out.println("You are unable to pass the test because you have failed too many questions in part B");
                        testDone = true;
                        break;
                    }else if(wrongNumA > 2){
                        break;
                    }
                    while(true){
                        questionBIndex = (int)(Math.random()*(questionsB.size()));
                        if(!selectedQuestionsB.contains(questionBIndex)){
                            break;
                        }
                    }
                    System.out.println(questionsB.get(questionBIndex));
                    while(true){
                        answerB = sc.nextLine();
                        if(answerB.equals("A")){
                            break;
                        }else if(answerB.equals("B")){
                            break;
                        }else if(answerB.equals("C")){
                            break;
                        }else if(answerB.equals("D")){
                            break;
                        }else{
                            System.out.println("Invalid Input");
                        }
                    }
                    if(answerB.equals(answersB.get(questionBIndex))){
                        System.out.println("Correct\n");
                        correctNumB++;
                    }else{
                        System.out.println("False\n");
                        wrongNumB++;
                    }
                    selectedQuestionsB.add(questionBIndex);
                    scoreEstimator = ((correctNumA+correctNumB+6-i+1)/12)*100;
                    if(scoreEstimator < 75){
                        System.out.println("You are unable to pass the test because you have failed too many questions");
                        testDone = true;
                        break;
                    }
                }
                if(!testDone){
                    scoreB = Math.round(correctNumB/6*100);
                    System.out.println("Your score for Part B is: " + scoreB + "%\n");
                    double finalScore = Math.round((correctNumA + correctNumB)/12*100);
                    System.out.println("Your final score is: " + finalScore + "%\n" + "Congratulation! You pass the test!\n" +
                            "Press Enter to continue");
                }else{
                    System.out.println("Your score is below the requirement and it is a fail\n" +
                            "Press Enter to continue");
                }
                String Skip = sc.nextLine();
                System.out.println("Do you want to log out or back to main menu (choose A or B)\n" +
                        "A) Log out\n" +
                        "B) Back to main menu");
                String finalDecision = "";
                while(true){
                    finalDecision = sc.nextLine();
                    if(finalDecision.equals("A")){
                        break;
                    }else if(finalDecision.equals("B")){
                        break;
                    }else{
                        System.out.println("Invalid Input");
                    }
                }
                if(finalDecision.equals("A")){
                    break;
                }else{
                    System.out.println("Now you are going back to main menu...\n" +
                            "Press Enter to continue");
                    String s_kip = sc.nextLine();
                }
            }
            if(userIdentity.equals("B")){
                System.out.println("Put in your password");
                //Password: 1234567890
                String password = sc.nextLine();
                if(password.equals("1234567890")){
                    System.out.println("Pick one option to continue\n" +
                            "A) Add a question\n" +
                            "B) Remove a question\n");
                    String choice = "";
                    while(true){
                        choice = sc.nextLine();
                        if(choice.equals("A")){
                            break;
                        }else if(choice.equals("B")){
                            break;
                        }else{
                            System.out.println("Invalid Input");
                        }
                    }
                    if(choice.equals("A")){
                        System.out.println("Which part you want to add a question on, A or B");
                        String part = "";
                        while(true){
                            part = sc.nextLine();
                            if(part.equals("A")){
                                break;
                            }else if(part.equals("B")){
                                break;
                            }else{
                                System.out.println("Invalid Input");
                            }
                        }
                        System.out.println("Now you can put in your details for the question,\n" +
                                "please remember to press enter after the question and each answer is inputted\n" +
                                "Press Enter to continue");
                        String skip = sc.nextLine();
                        System.out.print("Question:");
                        String newQuestion = sc.nextLine();
                        System.out.print("A) ");
                        String optionA = sc.nextLine();
                        System.out.print("B) ");
                        String optionB = sc.nextLine();
                        System.out.print("C) ");
                        String optionC = sc.nextLine();
                        System.out.print("D) ");
                        String optionD = sc.nextLine();
                        System.out.print("Which one is the correct answer: ");
                        String newAnswer = sc.nextLine();
                        if(part.equals("A")){
                            questionsA.add(newQuestion+"\n"+"A) "+optionA+"\n"+"B) "+optionB+"\n"+"C) "+optionC+"\n"+"A) "+optionD+"\n");
                            answersA.add(newAnswer);
                        }else{
                            questionsB.add(newQuestion+"\n"+"A) "+optionA+"\n"+"B) "+optionB+"\n"+"C) "+optionC+"\n"+"A) "+optionD+"\n");
                            answersB.add(newAnswer);
                        }
                    }
                    if(choice.equals("B")){
                        System.out.println("Which part you want to remove a question from, A or B");
                        String part = "";
                        while(true){
                            part = sc.nextLine();
                            if(part.equals("A")){
                                break;
                            }else if(part.equals("B")){
                                break;
                            }else{
                                System.out.println("Invalid Input");
                            }
                        }
                        if(part.equals("A")){
                            for(int i = 0; i < questionsA.size(); i++){
                                System.out.println((i+1)+". "+questionsA.get(i));
                            }
                            System.out.println("Put in the sequence number of the question that you want to remove");
                            int removedQuestionIndex = Integer.parseInt(sc.nextLine()) - 1;
                            questionsA.remove(removedQuestionIndex);
                        }
                        if(part.equals("B")){
                            for(int i = 0; i < questionsB.size(); i++){
                                System.out.println((i+1)+". "+questionsB.get(i));
                            }
                            System.out.println("Put in the sequence number of the question that you want to remove");
                            int removedQuestionIndex = Integer.parseInt(sc.nextLine()) - 1;
                            questionsB.remove(removedQuestionIndex);
                        }
                    }
                    System.out.println("Everything is saved, going back to the main menu...\n" +
                            "Press Enter to continue");
                    userIdentity = "";
                    String skip = sc.nextLine();
                }
            }
        }
    }
}
