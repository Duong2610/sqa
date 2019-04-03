/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Assurance;
import model.User;

/**
 *
 * @author duong
 */
public class UserDAO {
    private ArrayList <User> users = new ArrayList();
    Connection con;

    public UserDAO() {
    }

    public UserDAO(Connection con) {
        this.con = con;
    }
    
    public ArrayList<User> getAllUser(String thoiGian){
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try{
            ps=con.prepareStatement("SELECT full_name, cmnd, age, idbhxh,city, "
                    + "type, thunhapCB, tienBH, s.ngay FROM user AS u LEFT JOIN "
                    + "assurannce AS a ON u.id=a.id_user AND s.thang='"+thoiGian+ "'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                users.add(new User(rs.getString("full_name"),
                                    rs.getString("cmnd"),
                                    rs.getString("idbhxh"),
                                    rs.getString("city"),
                                    rs.getInt("age"),
                                    rs.getInt("type"),
                                   new Assurance(rs.getString("thang"),
                                   rs.getTimestamp("ngay"),
                                   rs.getFloat("luongCB"),
                                   rs.getFloat("tienBH"))));
            }
        }catch(SQLException ex){
            
        }
        return null;
    }
}
