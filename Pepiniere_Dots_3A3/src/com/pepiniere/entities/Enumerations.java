/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepiniere.entities;

/**
 *
 * @author AMZA
 */
public class Enumerations {

    public static BodyType[] BodyType;
    public enum Role{
	ADMIN,
	MEMBER
    }
    public enum BodyType{
	Plante,
	Fleur,
	Arbre
    }
}
