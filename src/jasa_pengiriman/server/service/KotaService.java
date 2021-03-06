/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasa_pengiriman.server.service;

import jasa_pengiriman.model.Kota;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface KotaService extends Remote {
  public List<Kota> getAll() throws RemoteException;
  public List<Kota> getByIdProvinsi(int idProvinsi) throws RemoteException;
  public boolean insert(Kota kota) throws RemoteException;
  public boolean update(Kota kota) throws RemoteException;
  public boolean deleteByIdKota(int idKota) throws RemoteException;
}
