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

#include <string>

namespace opmsg {

namespace marker {

using namespace std;

string dh_begin = "-----BEGIN PUBLIC KEY-----\n";
string dh_end = "-----END PUBLIC KEY-----\n";

string sig_begin = "-----BEGIN SIGNATURE-----\n";
string sig_end = "-----END SIGNATURE-----\n";

string dh_params_begin = "-----BEGIN DH PARAMETERS-----\n";
string dh_params_end = "-----END DH PARAMETERS-----\n";

string opmsg_begin = "-----BEGIN OPMSG-----\n";
string opmsg_end = "\n-----END OPMSG-----\n";
string opmsg_databegin = "-----BEGIN OPMSG DATA-----\n";

string kex_begin = "-----BEGIN KEX-----\n";
string kex_end = "-----END KEX-----\n";

string version = "version=1\n";
string src_id = "src-id=";
string dst_id = "dst-id=";
string kex_id = "kex-id=";

// in case no DH key is left, this signals standart RSA encrypted secret
string rsa_kex_id = "00000000";


// rythmz=persona-hash:key-hash:sign-hash:crypto:IV
string algos = "rythmz=";

}

}

