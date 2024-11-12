import java.util.Scanner;

public class AoPS {
    public class Map{
        public class MapRegion {
            MapNode adjacentRegions;
            int color = -1;

            // subclass that essentially acts as a linked list for regions
            private class MapNode {
                MapNode next = null;
                MapRegion region;
                public MapNode(MapRegion region, MapNode next) {
                    this.region = region;
                    this.next = next;
                }
            }

            // check if checkRegion borders this region 
            public boolean isTouching(MapRegion checkRegion) {
                MapNode tempMapNode = adjacentRegions;
                while (tempMapNode.next != null) {
                    if (tempMapNode.region == checkRegion) { break; }
                    tempMapNode = tempMapNode.next;
                }
                if (tempMapNode.region == checkRegion) { return true; }
                return false;
            }

            // connect connectRegion to this region to 
            public void connectToRegion(MapRegion connectRegion) {
                adjacentRegions = new MapNode(connectRegion, adjacentRegions);
            }

            // // disconnect disconnectRegion from this region  
            // public void disconnectFromRegion(MapRegion disconnectRegion) {
            //     MapNode tempMapNode = adjacentRegions;
            //     if (adjacentRegions == null) { return; }
            //     while (tempMapNode.next != null) {
            //         if (tempMapNode.region == disconnectRegion) { break; }
            //         tempMapNode = tempMapNode.next;
            //     }
            //     if (tempMapNode.region == checkRegion) { return true; }
            //     return false;
            // }

            
        }
        MapRegion[] regions;

        public Map(){
            Scanner console = new Scanner(System.in);
            System.out.println("How many regions? ");
            int intTemp = console.nextInt();
            console.close();
            new Map(intTemp);
        }
        public Map(int numRegions){
            regions = new MapRegion[numRegions];
        }

        // accesor for regions
        public MapRegion getMapRegion(int atIndex) {
            if (atIndex >= regions.length) {
                throw new IndexOutOfBoundsException("invalid region index");
            }
            return this.regions[atIndex];
        }
    }
    
    
    public static 
    public static int Question5 {
        Map mrMap = new Map(5);
        {   // connect region 0
            mrMap.getMapRegion(0).connectToRegion(mrMap.getMapRegion(1));
            mrMap.getMapRegion(0).connectToRegion(mrMap.getMapRegion(2));
            mrMap.getMapRegion(0).connectToRegion(mrMap.getMapRegion(3)); }
        {   // connect region 1
            mrMap.getMapRegion(1).connectToRegion(mrMap.getMapRegion(0));
            mrMap.getMapRegion(1).connectToRegion(mrMap.getMapRegion(3));
            mrMap.getMapRegion(1).connectToRegion(mrMap.getMapRegion(4)); }
        {   // connect region 2
            mrMap.getMapRegion(2).connectToRegion(mrMap.getMapRegion(0));
            mrMap.getMapRegion(2).connectToRegion(mrMap.getMapRegion(3)); }
        {   // connect region 3
            mrMap.getMapRegion(3).connectToRegion(mrMap.getMapRegion(0));
            mrMap.getMapRegion(3).connectToRegion(mrMap.getMapRegion(2));
            mrMap.getMapRegion(3).connectToRegion(mrMap.getMapRegion(2));
            mrMap.getMapRegion(3).connectToRegion(mrMap.getMapRegion(4)); }
        {   // connect region 4
            mrMap.getMapRegion(4).connectToRegion(mrMap.getMapRegion(1));
            mrMap.getMapRegion(4).connectToRegion(mrMap.getMapRegion(3)); }


        // mrMap.getMapRegion(0).color = 
    }
    public static void main(String[] args) {
        
    }
}
