
/*
 * This file is a straight transloation of
 * https://github.com/vandry/geoidheight/blob/master/geoid.py
 * which is mostly a straight translation of
 * GeographicLib/src/Geoid.cpp from C++ to Python
 * by Jarod Girardin <https://github.com/girardinj>
 *
 *
 * \file Geoid.cpp
 * \brief Implementation for GeographicLib::Geoid class
 *
 * Copyright (c) Charles Karney (2009) <charles@karney.com>
 * and licensed under the LGPL.  For more information, see
 * http://geographiclib.sourceforge.net/
 * **********************************************************************
 *
 * Geoid height grade not supported
 */

/**
 * Calculate the height of the WGS84 geoid above the
 * ellipsoid at any given latitude and longitude
 */

// https://github.com/vandry/geoidheight
public class GeoidHeight {
    public class GeoidBadDataFile extends Exception {
        public GeoidBadDataFile(String s) {
            super(s);
        }
    }

    private static final int c0 = 240;
    private static final int[][] c3 = {
            {  9, -18, -88,    0,  96,   90,   0,   0, -60, -20},
            { -9,  18,   8,    0, -96,   30,   0,   0,  60, -20},
            {  9, -88, -18,   90,  96,    0, -20, -60,   0,   0},
            {186, -42, -42, -150, -96, -150,  60,  60,  60,  60},
            { 54, 162, -78,   30, -24,  -90, -60,  60, -60,  60},
            { -9, -32,  18,   30,  24,    0,  20, -60,   0,   0},
            { -9,   8,  18,   30, -96,    0, -20,  60,   0,   0},
            { 54, -78, 162,  -90, -24,   30,  60, -60,  60, -60},
            {-54,  78,  78,   90, 144,   90, -60, -60, -60, -60},
            {  9,  -8, -18,  -30, -24,    0,  20,  60,   0,   0},
            { -9,  18, -32,    0,  24,   30,   0,   0, -60,  20},
            {  9, -18,  -8,    0, -24,  -30,   0,   0,  60,  20},
            };

    private static final int c0n = 372;
    private static final int[][] c3n = {
            {  0, 0, -131, 0,  138,  144, 0,   0, -102, -31},
            {  0, 0,    7, 0, -138,   42, 0,   0,  102, -31},
            { 62, 0,  -31, 0,    0,  -62, 0,   0,    0,  31},
            {124, 0,  -62, 0,    0, -124, 0,   0,    0,  62},
            {124, 0,  -62, 0,    0, -124, 0,   0,    0,  62},
            { 62, 0,  -31, 0,    0,  -62, 0,   0,    0,  31},
            {  0, 0,   45, 0, -183,   -9, 0,  93,   18,   0},
            {  0, 0,  216, 0,   33,   87, 0, -93,   12, -93},
            {  0, 0,  156, 0,  153,   99, 0, -93,  -12, -93},
            {  0, 0,  -45, 0,   -3,    9, 0,  93,  -18,   0},
            {  0, 0,  -55, 0,   48,   42, 0,   0,  -84,  31},
            {  0, 0,   -7, 0,  -48,  -42, 0,   0,   84,  31},
            };

    private static final int c0s = 372;
    private static final int[][] c3s = {
            { 18,  -36, -122,   0,  120,  135, 0,   0,  -84, -31},
            {-18,   36,   -2,   0, -120,   51, 0,   0,   84, -31},
            { 36, -165,  -27,  93,  147,   -9, 0, -93,   18,   0},
            {210,   45, -111, -93,  -57, -192, 0,  93,   12,  93},
            {162,  141,  -75, -93, -129, -180, 0,  93,  -12,  93},
            {-36,  -21,   27,  93,   39,    9, 0, -93,  -18,   0},
            {  0,    0,   62,   0,    0,   31, 0,   0,    0, -31},
            {  0,    0,  124,   0,    0,   62, 0,   0,    0, -62},
            {  0,    0,  124,   0,    0,   62, 0,   0,    0, -62},
            {  0,    0,   62,   0,    0,   31, 0,   0,    0, -31},
            {-18,   36,  -64,   0,   66,   51, 0,   0, -102,  31},
            { 18,  -36,    2,   0,  -66,  -51, 0,   0,  102,  31},
            };

    private Double offset = null;
    private Double scale = null;

    public GeoidHeight() {
        this("egm2008-1.pgm");
    }

    /**
     * @param name: name to PGM file containing model info
     * download from http://geographiclib.sourceforge.net/1.18/geoid.html
     **/
    public GeoidHeight(String name) {

    }

}
