// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CompressorPepe extends SubsystemBase {
  private final Compressor pepe = new Compressor(PneumaticsModuleType.CTREPCM);
  public CompressorPepe() {
  OffPepe();
  }
  public void OnPepe(){
  pepe.enableDigital();
  }
  public void OffPepe(){
    pepe.disable();
  }
  @Override
  public void periodic() {
    
  }
}
