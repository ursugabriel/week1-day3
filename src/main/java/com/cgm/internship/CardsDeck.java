package com.cgm.internship;
import com.cgm.internship.cardDeck.newVersion.Card;
import com.cgm.internship.cardDeck.newVersion.Deck;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CardsDeck extends JFrame {
    private JPanel panelMain;
    private JLabel table;
    int scoreLeft=0;
    int scoreRight=0;
    int currentLeftCard=0;
    int currentRightCard=0;
    int totalCardsPlayed=0;

    public static void restartGame(){
        new CardsDeck();
    }
    public CardsDeck(){

        Random randomNumber = new Random();

        Deck deck = new Deck();
        List<Card> cards= new ArrayList<>();
        cards.addAll(deck.getDeck());
        Collections.shuffle(cards);
        List<Card> deck1 = new ArrayList<>();
        List<Card> deck2 = new ArrayList<>();
        for(int i =0;i<cards.size();i++){
            if(i%2==0){
                deck1.add(cards.get(i));
            }
            if(i%2!=0){
                deck2.add(cards.get(i));
            }
        }

        setTitle("CardsDeck - War");
        setPreferredSize(new Dimension(1000,700));
        setResizable(false);

        //background
        JLabel background = new JLabel();
        JPanel p = new JPanel();
        ImageIcon backgroundIcon = new ImageIcon(new ImageIcon("src/greenTable.jpg").getImage().getScaledInstance(1000, 700, Image.SCALE_SMOOTH));
        background.setIcon(backgroundIcon);
        setContentPane(background);
        setLayout(null);

        //leftDeck1
        JButton leftDeck = new JButton();
        ImageIcon leftDeckIcon = new ImageIcon(new ImageIcon("src/deckLeft.png").getImage().getScaledInstance(190, 210, Image.SCALE_SMOOTH));
        leftDeck.setIcon(leftDeckIcon);
        leftDeck.setBorderPainted(false);
        leftDeck.setFocusPainted(false);
        leftDeck.setContentAreaFilled(false);
        leftDeck.setBounds(20,20,190,210);
        getContentPane().add(leftDeck);

        //cardsRemainingLeft
        JLabel cardsRemainingLeft = new JLabel();
        cardsRemainingLeft.setPreferredSize(new Dimension(120,20));
        cardsRemainingLeft.setText("Cards remaining: 26");
        cardsRemainingLeft.setHorizontalAlignment(SwingConstants.CENTER);
        cardsRemainingLeft.setVerticalAlignment(SwingConstants.CENTER);
        cardsRemainingLeft.setForeground(Color.WHITE);
        cardsRemainingLeft.setOpaque(false);
        cardsRemainingLeft.setFont(new Font("Times New Roman", Font.BOLD, 14));
        cardsRemainingLeft.setBounds(30,240, 150,20);
        getContentPane().add(cardsRemainingLeft,CENTER_ALIGNMENT);

        //cardsRemainingLeft
        JLabel cardsRemainingRight = new JLabel();
        cardsRemainingRight.setPreferredSize(new Dimension(120,20));
        cardsRemainingRight.setText("Cards remaining: 26");
        cardsRemainingRight.setHorizontalAlignment(SwingConstants.CENTER);
        cardsRemainingRight.setVerticalAlignment(SwingConstants.CENTER);
        cardsRemainingRight.setForeground(Color.WHITE);
        cardsRemainingRight.setOpaque(false);
        cardsRemainingRight.setFont(new Font("Times New Roman", Font.BOLD, 14));
        cardsRemainingRight.setBounds(805,240, 150,20);
        getContentPane().add(cardsRemainingRight,CENTER_ALIGNMENT);

        //scoreName
        JLabel scoreLabel = new JLabel();

        scoreLabel.setPreferredSize(new Dimension(100,100));
        scoreLabel.setText("SCORE");
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        scoreLabel.setVerticalAlignment(SwingConstants.CENTER);
        scoreLabel.setForeground(Color.BLACK);
        scoreLabel.setOpaque(false);
        scoreLabel.setFont(new Font("Century", Font.BOLD, 50));
        scoreLabel.setBounds(395,60, 194,60);
        getContentPane().add(scoreLabel,CENTER_ALIGNMENT);

        //scoreNameLeft
        JLabel scoreLabeLeft = new JLabel();
        scoreLabeLeft.setPreferredSize(new Dimension(100,100));
        scoreLabeLeft.setText(String.valueOf(scoreLeft));
        scoreLabeLeft.setHorizontalAlignment(SwingConstants.CENTER);
        scoreLabeLeft.setVerticalAlignment(SwingConstants.CENTER);
        scoreLabeLeft.setForeground(Color.BLACK);
        scoreLabeLeft.setOpaque(false);
        scoreLabeLeft.setFont(new Font("Century", Font.BOLD, 60));
        scoreLabeLeft.setBounds(370,115, 80,60);
        getContentPane().add(scoreLabeLeft,CENTER_ALIGNMENT);

        //scoreNameRight
        JLabel scoreLabeRight = new JLabel();
        scoreLabeRight.setPreferredSize(new Dimension(100,100));
        scoreLabeRight.setText(String.valueOf(scoreRight));
        scoreLabeRight.setHorizontalAlignment(SwingConstants.CENTER);
        scoreLabeRight.setVerticalAlignment(SwingConstants.CENTER);
        scoreLabeRight.setForeground(Color.BLACK);
        scoreLabeRight.setOpaque(false);
        scoreLabeRight.setFont(new Font("Century", Font.BOLD, 60));
        scoreLabeRight.setBounds(534,115, 80,60);
        getContentPane().add(scoreLabeRight,CENTER_ALIGNMENT);


        //leftDeck3
        JButton rightDeck = new JButton();
        ImageIcon rightDeckIcon = new ImageIcon(new ImageIcon("src/deckRight.png").getImage().getScaledInstance(190, 210, Image.SCALE_SMOOTH));
        rightDeck.setIcon(rightDeckIcon);
        rightDeck.setBorderPainted(false);
        rightDeck.setFocusPainted(false);
        rightDeck.setContentAreaFilled(false);
        rightDeck.setBounds(775,20,190,210);
        getContentPane().add(rightDeck);

        //leftCard
        JButton leftCard = new JButton();
        ImageIcon leftCardIcon = new ImageIcon(new ImageIcon("src/red_back.png").getImage().getScaledInstance(200, 310, Image.SCALE_SMOOTH));
        leftCardIcon.setDescription("Empty");
        leftCard.setIcon(leftCardIcon);
        leftCard.setBorderPainted(false);
        leftCard.setFocusPainted(false);
        leftCard.setContentAreaFilled(false);
        leftCard.setBounds(200,300,200,310);
        getContentPane().add(leftCard);

        //rightCard
        JButton rightCard = new JButton();
        ImageIcon rightCardIcon = new ImageIcon(new ImageIcon("src/red_back.png").getImage().getScaledInstance(200, 310, Image.SCALE_SMOOTH));
        rightCardIcon.setDescription("Empty");
        rightCard.setIcon(rightCardIcon);
        rightCard.setBorderPainted(false);
        rightCard.setFocusPainted(false);
        rightCard.setContentAreaFilled(false);
        rightCard.setBounds(585,300,200,310);
        getContentPane().add(rightCard);

        leftDeck.getModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ButtonModel model =(ButtonModel) e.getSource();
                if (model.isRollover()) {
                    ImageIcon leftDeckIcon = new ImageIcon(new ImageIcon("src/deckLeftHover.png").getImage().getScaledInstance(190, 210, Image.SCALE_SMOOTH));
                    leftDeck.setIcon(leftDeckIcon);
                    if(model.isPressed()) {
                        totalCardsPlayed++;
                        leftCardIcon.setDescription("NotEmpty");

                        if(!leftCard.isEnabled()){
                            leftCard.setEnabled(true);
                            rightCard.setEnabled(true);
                        }
                        else{leftCard.setEnabled(true);
                            rightCard.setEnabled(false);}

                        int randomCard = randomNumber.nextInt(deck1.size());
                        String fileName = "src/cardsPNG/"+deck1.get(randomCard).toString()+".png";
                        currentLeftCard =deck1.get(randomCard).valueOfCard().getValue();
                        ImageIcon leftCardIcon = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(200, 310, Image.SCALE_SMOOTH));
                        leftCard.setIcon(leftCardIcon);
                        deck1.remove(randomCard);
                        String msg ="Cards remaining: "+deck1.size();
                        cardsRemainingLeft.setText(msg);


                        if(leftCardIcon.getDescription()!="Empty" && rightCardIcon.getDescription()!="Empty"){
                            if(leftCard.isEnabled()==true && rightCard.isEnabled()==true){
                                if(currentLeftCard>currentRightCard){
                                    scoreLeft++;
                                    scoreLabeLeft.setText(String.valueOf(scoreLeft));
                                }
                                else if(currentLeftCard==currentRightCard){
                                    scoreLabeLeft.setText(String.valueOf(scoreLeft));
                                }
                                else {
                                    scoreRight++;
                                    scoreLabeRight.setText(String.valueOf(scoreRight));
                                }

//
                            }
                        }
                        if(totalCardsPlayed==cards.size()){
                            String winner ="";
                            if(Integer.parseInt(scoreLabeLeft.getText())<Integer.parseInt(scoreLabeRight.getText())){
                                winner="Right side wins!";
                            }
                            else if(Integer.parseInt(scoreLabeLeft.getText())>Integer.parseInt(scoreLabeRight.getText())) {
                                winner="Left side wins!";
                            }
                            else {
                                winner="What a close tie!";
                            }

                            Object[] options = {"New game", "Close game"};
                            int dialogResult = JOptionPane.showOptionDialog(null,winner+" Final score: "+scoreLabeLeft.getText()+" to "+scoreLabeRight.getText()+".","Match ended!",JOptionPane.YES_NO_OPTION, 3,null,options,options[0]);
                            if(dialogResult == 0) {
                                CardsDeck.restartGame();
                                dispose();
                            } else {
                                System.exit(0);
                            }
                        }

                        leftDeck.setEnabled(false);
                        leftDeck.setRolloverEnabled(false);
                        rightDeck.setEnabled(true);
                        rightDeck.setRolloverEnabled(true);

                    }
                }
                else {
                    ImageIcon leftDeckIcon = new ImageIcon(new ImageIcon("src/deckLeft.png").getImage().getScaledInstance(190, 210, Image.SCALE_SMOOTH));
                    leftDeck.setIcon(leftDeckIcon);
                }



            }
        });

        rightDeck.getModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ButtonModel model =(ButtonModel) e.getSource();
                if (model.isRollover()) {
                    ImageIcon leftDeckIcon = new ImageIcon(new ImageIcon("src/deckRightHover.png").getImage().getScaledInstance(190, 210, Image.SCALE_SMOOTH));
                    rightDeck.setIcon(leftDeckIcon);
                    if(model.isPressed()) {
                        totalCardsPlayed++;
                        rightCardIcon.setDescription("NotEmpty");

                        if(rightCard.isEnabled()){
                            rightCard.setEnabled(true);
                            leftCard.setEnabled(false);
                        }
                        else {
                            rightCard.setEnabled(true);
                            leftCard.setEnabled(true);
                        }

                        int randomCard = randomNumber.nextInt(deck2.size());
                        String fileName = "src/cardsPNG/"+deck2.get(randomCard).toString()+".png";
                        currentRightCard =deck2.get(randomCard).valueOfCard().getValue();
                        ImageIcon rightCardIcon = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(200, 310, Image.SCALE_SMOOTH));
                        rightCardIcon.setDescription("NotEmpty");
                        rightCard.setIcon(rightCardIcon);
                        deck2.remove(randomCard);
                        String msg ="Cards remaining: "+deck2.size();
                        cardsRemainingRight.setText(msg);

                        if(leftCardIcon.getDescription()!="Empty" && rightCardIcon.getDescription()!="Empty"){
                            if(leftCard.isEnabled()==true && rightCard.isEnabled()==true){
                                if(currentLeftCard>currentRightCard){
                                    scoreLeft++;
                                    scoreLabeLeft.setText(String.valueOf(scoreLeft));
                                }
                                else if(currentLeftCard==currentRightCard){
                                    scoreLabeLeft.setText(String.valueOf(scoreLeft));
                                }
                                else {
                                    scoreRight++;
                                    scoreLabeRight.setText(String.valueOf(scoreRight));
                                }
                            }
                        }
                        if(totalCardsPlayed==cards.size()){
                            String winner ="";
                            if(Integer.parseInt(scoreLabeLeft.getText())<Integer.parseInt(scoreLabeRight.getText())){
                                winner="Right side wins!";
                            }
                            else if(Integer.parseInt(scoreLabeLeft.getText())>Integer.parseInt(scoreLabeRight.getText())) {
                                winner="Left side wins!";
                            }
                            else {
                                winner="What a close tie!";
                            }

                            Object[] options = {"New game", "Close game"};
                            int dialogResult = JOptionPane.showOptionDialog(null,winner+" Final score: "+scoreLabeLeft.getText()+" to "+scoreLabeRight.getText()+".","Match ended!",JOptionPane.YES_NO_OPTION, 3,null,options,options[0]);
                            if(dialogResult == 0) {
                                CardsDeck.restartGame();
                                dispose();
                            } else {
                                System.exit(0);
                            }
                        }

                        rightDeck.setEnabled(false);
                        rightCard.setRolloverEnabled(false);
                        leftDeck.setEnabled(true);
                        leftDeck.setRolloverEnabled(true);
                    }
                }
                else {
                    ImageIcon leftDeckIcon = new ImageIcon(new ImageIcon("src/deckRight.png").getImage().getScaledInstance(190, 210, Image.SCALE_SMOOTH));
                    rightDeck.setIcon(leftDeckIcon);
                }


            }
        });




        pack();
        setVisible(true);
        setLocationRelativeTo(null);//must be after pack() and size in order to be centered using null
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {
        new CardsDeck();

    }
}
