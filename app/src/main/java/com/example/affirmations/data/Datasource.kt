package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource() {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.rugby),
            Affirmation(R.string.affirmation2, R.drawable.zinzanbrooke),
            Affirmation(R.string.affirmation3, R.drawable.garethedwards),
            Affirmation(R.string.affirmation4, R.drawable.jonnywilkinson),
            Affirmation(R.string.affirmation5, R.drawable.martinjohnson),
            Affirmation(R.string.affirmation6, R.drawable.jonahlomu ),
            Affirmation(R.string.affirmation7, R.drawable.davidcampese ),
            Affirmation(R.string.affirmation8, R.drawable.brian),
            Affirmation(R.string.affirmation9, R.drawable.michaeljones),
            Affirmation(R.string.affirmation10, R.drawable.dancarter),
            Affirmation(R.string.affirmation11, R.drawable.richiemccaw))
    }
}
