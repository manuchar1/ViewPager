package com.example.viewpager


enum class PagerEnum(
        val titleResId: Int,
        val layoutResId: Int)
{
    MOON(R.string.moon, R.layout.view_moon),
    ALIEN(R.string.aliens, R.layout.view_alien),
    ROCKET(R.string.rocket, R.layout.view_rocket),
    SATELLITE(R.string.satellite,R.layout.view_satellite),
    PLANET(R.string.planet,R.layout.view_planet),
    UFO(R.string.ufo,R.layout.view_ufo),
    ASTRONAUT(R.string.astronaut,R.layout.view_astronaut)

}