package org.example.lesson_11

import java.awt.Button

class RecipeCategory(
    val categoryName: String,
    val categoryIcon: String,
    val recipeName: String,
    val recipeIcon: String,
    val inFavoritesButton: Button,
    val inFavorites: Boolean = false,
    val categoryButton: Button,
) {}

class Recipe(
    val recipeName: String,
    val recipeIcon: String,
    val ingredients: MutableList<Ingredient>,
    val inFavoritesButton: Button,
    val inFavorites: Boolean = false,
    val categoryButton: Button,
) {}

class Ingredient(
    val numberOfServings: Int,
    val ingredientName: MutableList<String>,
    val amountOfIngredient: MutableList<String>,
) {}