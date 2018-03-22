package PlayingField;

import Game.Build;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

public class TileMap {

    public static final int tileWidth = 32;
    public static final int tileHeight = 32;

    public TilePiece[][] map;


    public TileMap(int rows, int cols) {

        map = new TilePiece[rows][cols];

        for(int i = 0; i<rows; i++){

            for(int j = 0; j<cols; j++){

                map[i][j] = new TilePiece(i,j); //creating one tilepiece for every position in the rows and columns
                System.out.println("Created a TilePiece at row " + map[i][j].row + ", column " + map[i][j].column);

            }

        }

    }
    public TilePiece getTilePieceAtCoordinate(int x,int y){

        return this.map[ (int) Math.floor(x/TileMap.tileWidth) ] [ (int) Math.floor(y/TileMap.tileHeight) ]; //uses the coordinates to find the TilePiece that would be spanning over that point.

    }
    public Dimension getDimensionOfTilePiece(TilePiece p){

        return new Dimension(p.getX(), p.getY());

    }
    public void drawTilePiece(Graphics2D g2d){

        for(TilePiece[] a: map){

            for(TilePiece p: a){

                Image image;
                try{

                    image = ImageIO.read(new File("images/tiles/TileA2 [www.imagesplitter.net]-0-0.jpeg")); //placeholder for
                    g2d.drawImage(image, p.getX(), p.getY(), 32, 32, Build.mainGraphic);
                    System.out.println("Drew and image!");

                }catch(Exception e){

                    System.out.println(e.getStackTrace()+ " death");

                }



            }

        }

    }

}

