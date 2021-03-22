/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasa_pengiriman.server.service;

import jasa_pengiriman.model.Cabang;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Riett
 */
public interface CabangService extends Remote {
  public List<Cabang> getAll() throws RemoteException;
  public List<Cabang> getByIdKota(int idKota) throws RemoteException;
}
