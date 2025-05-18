const FlightVisitor = require('./generated/FlightVisitor').default;

class CustomFlightVisitor extends FlightVisitor {
  visitVuelo(ctx) {
    return {
      code: ctx.codigo_vuelo().getText(),
      from: ctx.aeropuerto(0).getText(),
      to: ctx.aeropuerto(1).getText(),
      time: ctx.hora().getText(),
      status: ctx.estado().getText(),
      gate: ctx.puerta().getText()
    };
  }
}

module.exports = CustomFlightVisitor;


