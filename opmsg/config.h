/*
 * This file is part of the opmsg crypto message framework.
 *
 * (C) 2015 by Sebastian Krahmer,
 *             sebastian [dot] krahmer [at] gmail [dot] com
 *
 * opmsg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * opmsg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with opmsg.  If not, see <http://www.gnu.org/licenses/>.
 */

#ifndef __config_h__
#define __config_h__

#include <string>

namespace opmsg {

namespace config {

extern int dh_plen, rsa_len, new_dh_keys, rsa_override;
extern std::string rsa_e;

extern std::string infile, outfile, calgo, idformat, my_id;
extern std::string phash, shash, khash, cfgbase;

}

int parse_config(const std::string &);

}

#endif

