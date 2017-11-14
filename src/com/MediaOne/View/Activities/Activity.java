/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MediaOne.View.Activities;

import com.MediaOne.View.Components.MyTable;
import javax.swing.JPanel;

/**
 *
 * @author MyPC
 */
public class Activity extends JPanel{
    MyTable tb;
    int status;
    public Activity(){
        initActivity();
    }
    public void initActivity(){
        status = 1;
    }
}
