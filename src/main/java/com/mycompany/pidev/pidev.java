/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pidev;

import interfaces.InterfaceCRUD;
import models.Categorie;
import models.Produit;
import services.CategorieService;
import services.ProduitService;


/**
 *
 * @author 21694
 */
public class pidev {

    public static void main(String[] args) {
        // service init
       InterfaceCRUD ps = new ProduitService();
       InterfaceCRUD pc = new CategorieService();
        
//Produit init
//         Produit p = new Produit();
//         p.setNom_prod("gilet");
//         p.setType_prod("vetement");
//         p.setPrix_prod(100.45);
//         p.setDescription_prod("Gilet pour le groupe de redbull");


//Produit init 2eme methode
Categorie c1 = new Categorie(6,"vetement","Des produit que les supporteurs peuvent porter ");
Categorie c2 = new Categorie(7,"mecanique","les pieces de voitures ");

 Produit p1 = new Produit(1,"veste",27.25,"veste cuir de bonne qulaite",12,c1);
 Produit p2 = new Produit(26,"moteur",300.0,"moteur de haute puissance original ZX94",13,c2); 
 Produit p3 = new Produit(4,"pull",27.25,"pull pour les asupporteur de Redbull",20,c1); 
//add action
 //ps.insert(p3);   
         
//supprime action
// ps.delete(11);    
    
//update action    
//p2.setNom_prod("hihihi");
//ps.update(p2);

 //readAll action
//  System.out.println(ps.readAll());
  
//Sort action
 // System.out.println(ps.sortBy("nom_prod", "DESC"));
       
//readByID       
//System.out.println(ps.readById(25));

//recherche action
//System.out.println(ps.chercher("nom_prod", "veste")); 
       
//******Categorie*****         
//Categorie init 2eme methode
//Categorie c1 = new Categorie("mecanique","les pieces de voitures ");

//add action
//pc.insert(c1);


 //readAll action
 //System.out.println(pc.readAll());
 
//update action    
//c2.setNom_categorie("mecan");
//pc.update(c2);

//supprime action
 //pc.delete(3);   

//readByID       
//System.out.println(pc.readById(2)); 

//Sort action
//System.out.println(pc.sortBy("nom_categorie", "ASC"));

//recherche action
//System.out.println(pc.chercher("nom_categorie", "aaa")); 


    }
}