package com.isep.rpg;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class Player implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Text Group_list;
    @FXML
    private Text Info;
    @FXML
    private Text Info_items;
    @FXML
    private Text Info_stats;
    @FXML
    private AnchorPane Player;
    @FXML
    private Button game_play;
    @FXML
    private Button healer;
    @FXML
    private Button hunter;
    @FXML
    private ImageView image_class;
    @FXML
    private Button mage;
    @FXML
    private TextField name;
    @FXML
    private HBox nom;
    @FXML
    private HBox role;
    @FXML
    private Button team_add;
    @FXML
    private Button warrior;
    @FXML
    private Text text;
    int power = 0;

    public Player() {
    }


    public void Hunter(ActionEvent event) throws IOException {
        Info.setText(" Hunter : \n\nLe Chasseur combat aussi bien de près que de loin. Il possède une grande précision mais avec une plus grande fragilité qu'un guerrier. C'est pour cela qu'il est plus efficace de loin avec son arc et ses flèches.\n");
        Info_stats.setText(" Points de vie : 30 \n Armure : 20 \n Dégats : 30 \n Points de Mana : 50 \n");
        Info_items.setText(" Objets: \n Fléches : 50 \n");
        power = 1;
    }

    public void Mage(ActionEvent event) throws IOException {
        Info.setText(" Mage : \n\nLe Mage combat avec ses pouvoirs. Il est capable de faire beaucoup de dégâts avec ses différents sorts, il utilise sa magie pour générer différentes armes qui peuvent être très puissantes.\n");
        Info_stats.setText(" \n Points de vie : 25 \n Armure : 20 \n Dégats : 60 \n Points de Mana : 80 \n");
        Info_items.setText(" \n Objets: \n Aucun  \n");
        power = 2;
    }

    public void Warrior(ActionEvent event) throws IOException {
        Info.setText(" Warrior : \n\nLe Guerrier est très robuste et fait beaucoup de dégâts mais il ne peut se battre qu'au corps à corps, il fonce sur ses ennemies sans se poser de questions. En effet un guerrier n'a pas peur de sauter dans le tas.\n");
        Info_stats.setText(" \n Points de vie : 50 \n Armure : 30 \n Dégats : 50 \n Points de Mana : 30 \n");
        Info_items.setText(" \n Objets: \n Aucun \n");
        power = 3;
    }

    public void Healer(ActionEvent event) throws IOException {
        Info.setText(" Healer : \n\nLa Soigneuse est une troupe support, c'est à dire qu'elle va permettre de régénérer des points de vies à ses différents alliés. Avec sa magie elle peut sauver plusieurs vies.\n");
        Info_stats.setText(" \n Points de vie : 20 \n Armure : 10 \n Dégats : 15 \n  Points de Mana : 100 \n");
        Info_items.setText(" \n Objets: \n Aucun\n");
        power = 4;
    }
    int g=0;
    static ArrayList Group = new ArrayList<>();
    public void Ajouter(){
        if (Group.size()<=4){
            switch(power){
                case 1 :
                    Main.heroes.add(new Hunter(name.getText()));
                    Group.add(name.getText() + "\nHunter \n");
                    break;
                case 2 :
                    Main.heroes.add(new Mage(name.getText()));
                    Group.add(name.getText() + "\nMage \n");
                    break;
                case 3 :
                    Main.heroes.add(new Warrior(name.getText()));
                    Group.add(name.getText() + "\nWarrior \n");
                    break;
                case 4 :
                    Main.heroes.add(new Healer(name.getText()));
                    Group.add(name.getText() + "\nHealer \n");
                    break;
            }
            switch (Group.size()){
                case 1 :Group_list.setText("\n"+Main.heroes.get(0).getName()+"  "+  Main.heroes.get(0).getClasse()+"\n");game_play.setDisable(false);break;
                case 2 :Group_list.setText("\n"+Main.heroes.get(0).getName()+"  "+  Main.heroes.get(0).getClasse()+"\n"+"\n"+Main.heroes.get(1).getName()+"  "+ Main.heroes.get(1).getClasse()+"\n");game_play.setDisable(false);break;
                case 3 :Group_list.setText("\n"+Main.heroes.get(0).getName()+"  "+  Main.heroes.get(0).getClasse()+"\n"+"\n"+Main.heroes.get(1).getName()+"  "+ Main.heroes.get(1).getClasse()+"\n"+"\n"+Main.heroes.get(2).getName()+"  "+  Main.heroes.get(2).getClasse()+"\n");game_play.setDisable(false);break;
                case 4 :Group_list.setText("\n"+Main.heroes.get(0).getName()+"  "+  Main.heroes.get(0).getClasse()+"\n"+"\n"+Main.heroes.get(1).getName()+"  "+ Main.heroes.get(1).getClasse()+"\n"+"\n"+Main.heroes.get(2).getName()+"  "+  Main.heroes.get(2).getClasse()+"\n"+"\n"+Main.heroes.get(3).getName()+"  "+  Main.heroes.get(3).getClasse()+"\n");team_add.setDisable(true);game_play.setDisable(false);break;
            }
        }
        else{
            team_add.setDisable(true);
        }
    }
    int round = 1;
    public static void CreateEnemy(int round){
        for (int i = 0; i < Main.heroes.size(); i++) {
            if (Math.random() > round*0.2) {
                int lifePoints = new Random().nextInt(round*3/2+15)+10;
                int armor = new Random().nextInt(round+5) ;
                int damage = new Random().nextInt(round*5+10);
                String name = "Orc";
                Main.enemies.add(new BasicEnemy(name, lifePoints, "basic", armor, damage));
            }else {
                int lifePoints = new Random().nextInt(100)+ round * 10;
                int armor = new Random().nextInt(round+5)+10;
                int damage = new Random().nextInt(round*10)+20;
                String name = "Démon";
                Main.enemies.add(new Boss(name, lifePoints, "boss", armor, damage));
            }
        }
    }
    @FXML
    private void switchtoPlay() throws IOException {
        CreateEnemy(round);
        Main.setRoot("Play");
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }
}
